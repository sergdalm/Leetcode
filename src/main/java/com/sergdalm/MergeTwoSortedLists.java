package com.sergdalm;

import com.sergdalm.collection.ReverseLinkedList.ListNode;

/**
 * No: 21
 * Title: Merge Two Sorted Lists
 * Difficulty: Easy
 * <p>
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists in a one sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 * <p>
 * <p>
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
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode();
        list1.val = 1;
        list1.next = new ListNode();
        list1.next.val = 2;
        list1.next.next = new ListNode();
        list1.next.next.val = 4;

        ListNode list2 = new ListNode();
        list2.val = 1;
        list2.next = new ListNode();
        list2.next.val = 3;
        list2.next.next = new ListNode();
        list2.next.next.val = 4;

        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode sortedList = null;
        if (list1 != null) {
            ListNode tempNode = list1;
            while (tempNode != null) {
                sortedList = putInOrder(sortedList, tempNode.val);
                tempNode = tempNode.next;
            }
        }

        if (list2 != null) {
            ListNode tempNode = list2;
            while (tempNode != null) {
                sortedList = putInOrder(sortedList, tempNode.val);
                tempNode = tempNode.next;
            }
        }

        return sortedList;
    }

    private static ListNode putInOrder(ListNode sortedList, int val) {
        if (sortedList == null) {
            sortedList = new ListNode();
            sortedList.val = val;
        } else if (sortedList.val > val) {
            int temp = sortedList.val;
            ListNode newNode = new ListNode();
            newNode.val = temp;
            newNode.next = sortedList.next;
            sortedList.next = newNode;
            sortedList.val = val;
        } else {
            ListNode tempNode = sortedList;
            while (tempNode.next != null) {
                if (tempNode.next.val > val) {
                    ListNode newNode = new ListNode();
                    newNode.val = val;
                    newNode.next = tempNode.next;
                    tempNode.next = newNode;
                    break;
                } else {
                    tempNode = tempNode.next;
                }
            }
            if (tempNode.next == null) {
                tempNode.next = new ListNode();
                tempNode.next.val = val;
            }
        }
        return sortedList;
    }
}

