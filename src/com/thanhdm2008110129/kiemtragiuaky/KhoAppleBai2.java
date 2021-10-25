package com.thanhdm2008110129.kiemtragiuaky;

public class KhoAppleBai2 {
    
        Node head;
      
        static class Node {
          Apple apple;
          Node next;
      
          Node(Apple apple) {
            this.apple = apple;
            next = null;
          }
        }
      
        public void add(Apple apple) {
          // Thêm phần tử đầu tiên
          if (head == null) {
            head = new Node(apple);
            return;
          }
      
          // Thêm vào cuối danh sách
          Node checkingNode = head;
          while (checkingNode.next != null) {
            checkingNode = checkingNode.next;
          }
          checkingNode.next = new Node(apple);
        }
      
        public void add(int addingIndex, Apple apple) {
          // Thêm phần tử đầu tiên
          if (head == null) {
            head = new Node(apple);
            return;
          }
      
          Node newNode = new Node(apple);
          // Thêm vào đầu
          if (addingIndex == 0) {
            newNode.next = head;
            head = newNode;
            return;
          }
          // Thêm vào vị trí bất kỳ (hoặc cuối)
          int checkingIndex = 0;
          Node checkingNode = head;
          while (checkingNode.next != null && ++checkingIndex < addingIndex) {
            checkingNode = checkingNode.next;
          }
          newNode.next = checkingNode.next;
          checkingNode.next = newNode;
        }
      
        public void addFirst(Apple apple) {
          add(0, apple);
        }
      
        void timTheoId(int id) {
          Node checkingNode = head;
          boolean found = false;
          while (checkingNode.next != null) {
            if (checkingNode.apple.id == id) {
              System.out.println("Tim thay Apple voi id la: " + id);
              checkingNode.apple.inThongTin();
              found = true;
              break;
            } else {
              checkingNode = checkingNode.next;
            }
          }
          if (!found) {
            System.out.println("KHONG tim thay Apple voi id la: " + id);
          }
        }
      }
    

