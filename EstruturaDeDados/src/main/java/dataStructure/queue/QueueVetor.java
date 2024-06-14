package dataStructure.queue;

import java.util.Random;

public class QueueVetor {

	public static void main(String[] args) {
		int[] a = new int[100];
		var randomQueue = new Random();

		int numero = randomQueue.nextInt(101);
		Queue myArrayQueue = new Queue(numero);

		for (int i = 1; i <= a.length; i++) {
			numero = randomQueue.nextInt(i);
			System.out.println(numero);
			myArrayQueue.enqueue(numero);
		}
		
		var node = myArrayQueue.dequeue();
		while(node != null) {
			System.out.println("desenfileirando" + node.getValue());
			node = myArrayQueue.dequeue();
		}

	}

}
