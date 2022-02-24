package com.bridgelabz.uc2;


	public class LinkedList<T> {

		MyNode<T> head;

		public void add(T data) {
			MyNode<T> newNode = new MyNode<>();
			newNode.data = data;
			if (head == null) {
				head = newNode;

			} else {
				MyNode<T> node = head;
				while (node.next != null) {
					node = node.next;
				}
				node.next = newNode;
			}
		}

		public  void addAtStart (T data) {
			MyNode<T> node =new MyNode<>();
			node.data=data;
			node.next=head;
			head=node;
		}

		public void show() {
			MyNode<T> node = head;
			while (node.next != null) {
				System.out.println(node.data);
				node=node.next;;
			}
			System.out.print(node.data);
		}

	}

