package maratona.java.devdojo.Davancado.threads.test;

import javax.swing.JOptionPane;

import maratona.java.devdojo.Davancado.threads.dominio.Members;
import maratona.java.devdojo.Davancado.threads.service.EmailDeliveryService;

public class Aula228WaitNotifyAndNotifyAll {

	public static void main(String[] args) {
		Members members = new Members();

		Thread threadEmail = new Thread(new EmailDeliveryService(members), "THREAD_EMAIL");
		Thread threadEmail2 = new Thread(new EmailDeliveryService(members), "THREAD_EMAIL_2");

		threadEmail.start();
		threadEmail2.start();

		while (true) {
			String viewInputEmail = JOptionPane.showInputDialog("Entre com seu email: ");

			if (viewInputEmail == null) {
				members.close();

				break;
			}

			if (viewInputEmail.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Por favor, insira um email!");
			} else {
				members.addMemberEmail(viewInputEmail);
			}
		}
	}

}
