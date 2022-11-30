package view;

import java.util.Arrays;
import java.util.Scanner;

import model.NotificaItem;

public class ItemView {

	public void iniciar() {
		Scanner ler = new Scanner(System.in);
		String iniciar;
		System.out.printf("Você quer adicionar ou remover o Item? 1 adiciona 2 remove 3 sair:\n");
		iniciar = ler.nextLine();

		ItemIndex itemIndex = new ItemIndex(Arrays.asList(new ItemView()));

		while (!iniciar.equals("3")) {
			if (iniciar.equals("1")) {

				itemIndex.cadatrarItem();
			} else {
				itemIndex.removerItem();
			}

			iniciar = null;

			System.out.println();
			System.out.printf("Você quer adicionar ou remover o Item? 1 adiciona 2 remove 3 sair:\n");
			iniciar = ler.nextLine();

		}
	}
}
