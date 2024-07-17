package _SourceCode;

import java.util.HashMap;
import java.util.Map;

class WebBrowser {
  private Node head;
  private Node current;
  private Map<String, Integer> visitCount;

  private class Node {
    String url;
    Node prev;
    Node next;

    Node(String url) {
       this.url = url;
    }
  }

  public WebBrowser() {
    head = null;
    current = null;
    visitCount = new HashMap<>();
  }

  public void visit(String url) {
    Node newNode = new Node(url);
    if (head == null) {
      head = newNode;
      current = newNode;
    } else {
      current.next = newNode;
      newNode.prev = current;
      current = newNode;
    }

    visitCount.put(url, visitCount.getOrDefault(url, 0) + 1);
  }

  public String back() {
    if (current != null && current.prev != null) {
      current = current.prev;
      return current.url;
    }
    return "Khong tim thay lich su de back";
  }

  public String forward() {
    if (current != null && current.next != null) {
      current = current.next;
      return current.url;
    }
    return "Khong tim thay lich su de forward";
  }

  public void listVisited() {
    Node temp = head;
    while (temp != null) {
      System.out.println(temp.url);
      temp = temp.next;
    }
  }

  public void clearHistory() {
    head = null;
    current = null;
    visitCount.clear();
  }

  public void visitStatistics() {
    for (Map.Entry<String, Integer> entry : visitCount.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue() + " visits");
    }
  }

  public static void main(String[] args) {
    WebBrowser browser = new WebBrowser();
    browser.visit("http://example.com");
    browser.visit("http://example2.com");
    System.out.println(browser.back());
    System.out.println(browser.forward());
    browser.listVisited();
    browser.clearHistory();
    browser.visitStatistics();

    browser.visit("http://example.com");
    browser.visit("http://example.com");
    browser.visitStatistics();
  }
}
