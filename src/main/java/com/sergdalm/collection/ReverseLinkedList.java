package com.sergdalm.collection;

import java.util.LinkedList;
import java.util.List;

/**
 * No: 206
 * Title: Reverse Linked List
 * Difficulty: Easy
 * <p>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * <p>
 * The number of nodes in the list is the range [0, 5000].
 * -5000 <= Node.val <= 5000
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode list = new ListNode(-5000);

        ListNode node = list;
        for (int i = list.val + 1; i <= 5000; i++) {
            node.next = new ListNode(i);
            node = node.next;
        }

        System.out.println(list);
        var reversedNode = reverseList(list);
        System.out.println(reversedNode);

        ListNode listNode = new ListNode(0);
        System.out.println(reverseList(listNode));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode node = head;
        List<Integer> list = new LinkedList<>();
        list.add(node.val);

        while (node.next != null) {
            node = node.next;
            list.add(node.val);
        }

        ListNode result = new ListNode(node.val);
        node = result;
        var listIterator = list.listIterator(list.size() - 1);
        while (listIterator.hasPrevious()) {
            node.next = new ListNode(listIterator.previous());
            node = node.next;

        }
        return result;
    }

    public static class ListNode {
        public int val;
        public ListNode next;


        public ListNode() {

        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(this.val);
            ListNode node = this;

            while (node.next != null) {
                stringBuilder.append(",");
                stringBuilder.append(node.next.val);
                node = node.next;
            }

            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }
}

