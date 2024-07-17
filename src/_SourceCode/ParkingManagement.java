package _SourceCode;

import java.util.ArrayList;
import java.util.List;

class AVLNode {
  String key;
  int height;
  AVLNode left, right;
  List<TimeEntry> times;

  AVLNode(String key) {
    this.key = key;
    this.height = 1;
    this.times = new ArrayList<>();
  }
}

class TimeEntry {
  String entryTime;
  String exitTime;

  TimeEntry(String entryTime) {
    this.entryTime = entryTime;
    this.exitTime = null;
  }
}

class AVLTree {
  private AVLNode root;

  private int height(AVLNode N) {
    if (N == null)
      return 0;
    return N.height;
  }

  private int max(int a, int b) {
    return (a > b) ? a : b;
  }

  private AVLNode rightRotate(AVLNode y) {
    AVLNode x = y.left;
    AVLNode T2 = x.right;

    x.right = y;
    y.left = T2;

    y.height = max(height(y.left), height(y.right)) + 1;
    x.height = max(height(x.left), height(x.right)) + 1;

    return x;
  }

  private AVLNode leftRotate(AVLNode x) {
    AVLNode y = x.right;
    AVLNode T2 = y.left;

    y.left = x;
    x.right = T2;

    x.height = max(height(x.left), height(x.right)) + 1;
    y.height = max(height(y.left), height(y.right)) + 1;

    return y;
  }

  private int getBalance(AVLNode N) {
    if (N == null)
      return 0;
    return height(N.left) - height(N.right);
  }

  public void insert(String key, String entryTime) {
    root = insert(root, key, entryTime);
  }

  private AVLNode insert(AVLNode node, String key, String entryTime) {
    if (node == null)
      return (new AVLNode(key));

    if (key.compareTo(node.key) < 0)
      node.left = insert(node.left, key, entryTime);
    else if (key.compareTo(node.key) > 0)
      node.right = insert(node.right, key, entryTime);
    else {
      node.times.add(new TimeEntry(entryTime));
      return node;
    }

    node.height = 1 + max(height(node.left), height(node.right));

    int balance = getBalance(node);

    if (balance > 1 && key.compareTo(node.left.key) < 0)
      return rightRotate(node);

    if (balance < -1 && key.compareTo(node.right.key) > 0)
      return leftRotate(node);

    if (balance > 1 && key.compareTo(node.left.key) > 0) {
      node.left = leftRotate(node.left);
      return rightRotate(node);
    }

    if (balance < -1 && key.compareTo(node.right.key) < 0) {
      node.right = rightRotate(node.right);
      return leftRotate(node);
    }

    return node;
  }

  public void updateExit(String key, String exitTime) {
    updateExit(root, key, exitTime);
  }

  private void updateExit(AVLNode node, String key, String exitTime) {
    if (node == null)
      return;

    if (key.compareTo(node.key) < 0)
      updateExit(node.left, key, exitTime);
    else if (key.compareTo(node.key) > 0)
      updateExit(node.right, key, exitTime);
    else {
      if (!node.times.isEmpty() && node.times.get(node.times.size() - 1).exitTime == null) {
        node.times.get(node.times.size() - 1).exitTime = exitTime;
      }
    }
  }

  public void delete(String key) {
    root = delete(root, key);
  }

  private AVLNode delete(AVLNode root, String key) {
    if (root == null)
      return root;

    if (key.compareTo(root.key) < 0)
      root.left = delete(root.left, key);
    else if (key.compareTo(root.key) > 0)
      root.right = delete(root.right, key);
    else {
      if ((root.left == null) || (root.right == null)) {
        AVLNode temp = null;
        if (temp == root.left)
          temp = root.right;
        else
          temp = root.left;

        if (temp == null) {
          temp = root;
          root = null;
        } else
          root = temp;
      } else {
        AVLNode temp = minValueNode(root.right);
        root.key = temp.key;
        root.times = temp.times;
        root.right = delete(root.right, temp.key);
      }
    }

    if (root == null)
      return root;

    root.height = max(height(root.left), height(root.right)) + 1;

    int balance = getBalance(root);

    if (balance > 1 && getBalance(root.left) >= 0)
      return rightRotate(root);

    if (balance > 1 && getBalance(root.left) < 0) {
      root.left = leftRotate(root.left);
      return rightRotate(root);
    }

    if (balance < -1 && getBalance(root.right) <= 0)
      return leftRotate(root);

    if (balance < -1 && getBalance(root.right) > 0) {
      root.right = rightRotate(root.right);
      return leftRotate(root);
    }

    return root;
  }

  private AVLNode minValueNode(AVLNode node) {
    AVLNode current = node;

    while (current.left != null)
      current = current.left;

    return current;
  }

  // Method to list all entries within a specific time period
  public List<String> listEntriesInRange(String startTime, String endTime) {
    List<String> result = new ArrayList<>();
    listEntriesInRange(root, startTime, endTime, result);
    return result;
  }

  private void listEntriesInRange(AVLNode node, String startTime, String endTime, List<String> result) {
    if (node == null)
      return;

    for (TimeEntry time : node.times) {
      if ((time.entryTime.compareTo(startTime) >= 0) && (time.entryTime.compareTo(endTime) <= 0)) {
        result.add(node.key + " Thoi gian xe vao tại: " + time.entryTime + " Thoi gian xe thoát tại: " + time.exitTime);
      }
    }

    listEntriesInRange(node.left, startTime, endTime, result);
    listEntriesInRange(node.right, startTime, endTime, result);
  }

  // Method to count the number of entries for a specific day
  public int countEntriesInDay(String day) {
    return countEntriesInDay(root, day);
  }

  private int countEntriesInDay(AVLNode node, String day) {
    if (node == null)
      return 0;

    int count = 0;
    for (TimeEntry time : node.times) {
      if (time.entryTime.startsWith(day)) {
        count++;
      }
    }

    count += countEntriesInDay(node.left, day);
    count += countEntriesInDay(node.right, day);

    return count;
  }
}

public class ParkingManagement {
  public static void main(String[] args) {
    AVLTree tree = new AVLTree();

    tree.insert("29-T8 2843", "2024-07-14 08:00");
    tree.updateExit("29-T8 2843", "2024-07-14 10:00");

    tree.insert("29-T8 2843", "2024-07-14 12:00");
    tree.updateExit("29-T8 2843", "2024-07-14 14:00");

    tree.insert("30-A1 1234", "2024-07-14 09:00");

    List<String> entries = tree.listEntriesInRange("2024-07-14 00:00", "2024-07-14 23:59");
    for (String entry : entries) {
      System.out.println(entry);
    }

    int count = tree.countEntriesInDay("2024-07-14");
    System.out.println("Total entries on 2024-07-14: " + count);
  }
}
