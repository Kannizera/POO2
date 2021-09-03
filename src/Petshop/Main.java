package PetShop;

import javax.swing.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String opcao;

        List<Funcionario> listaFuncionario = new ArrayList<>();

            opcao = JOptionPane.showInputDialog("CADASTRO DE FUNCIONÁRIO\n"
                    + "1 - Recepcionista;\n"
                    + "2 - Veterinario.");

            switch (Integer.parseInt(opcao)){

                case 1:
                    Funcionario recepcionista = new Recepcionista(
                           JOptionPane.showInputDialog("Nome do Funcionario: ");
                           JOptionPane.showInputDialog("CPF: ");
                           JOptionPane.showInputDialog("Função: ");

                    listaFuncionario.add(recepcionista);


                    break;

                case 2:
                    Funcionario veterinario = new Veterinario(
                            JOptionPane.showInputDialog("Nome do funcionário: ");
                            JOptionPane.showInputDialog("CPF: ");
                            JOptionPane.showInputDialog("Nº do CRMV: ");
                            JOptionPane.showInputDialog("Função: ");
                    listaFuncionario.add(veterinario);

                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Item invalido!!!");
                    break;

            }

        for(Funcionario x : listaFuncionario) {
            JOptionPane.showMessageDialog(null,"nome: " + x.getNome() + "\nFunção: " + x.getFuncao() + "\nCPF: " + x.getCpf());
        }
    }

    }


