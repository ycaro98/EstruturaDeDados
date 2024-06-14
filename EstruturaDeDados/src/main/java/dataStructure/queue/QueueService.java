package dataStructure.queue;

import java.util.Random;

public class QueueService {

	public static void main(String[] args) {
		int n = 5;
		var random = new Random();

		int cliente = random.nextInt(101);
		Queue myQueue = new Queue(cliente);

		System.out.println("Chegou o cliente: " + cliente);
		for (int i = 2; i <= n; i++) {
			cliente = random.nextInt(101);
			System.out.println("Chegou o cliente: " + cliente);
			myQueue.enqueue(cliente);
		}
		// Atendimento dos clientes
		var node = myQueue.dequeue();
		while (node != null) {
			System.out.println("Atendimento ao cliente: " + node.getValue());
			node = myQueue.dequeue();
		}

	}

}
