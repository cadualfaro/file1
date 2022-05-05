/*
Atividade 1

Vamos praticar!!
▪ Implemente uma função que recebe um path para um arquivo e
▪ Se ele existe, então lê o conteúdo do arquivo e mostra na tela
▪ Se ele não existe, então cria um arquivo e escreve o nome do aluno (seu nome)
 */
package file1;

import java.io.*;

public class File1 {

    public static void main(String[] args) throws IOException {
        File arquivo = new File("C:\\Users\\Public\\Documents\\aluno.txt");

            try {
                FileReader lerarquivo = new FileReader("C:\\Users\\Public\\Documents\\aluno.txt");
                    BufferedReader leitura = new BufferedReader(lerarquivo);
                        String linha = leitura.readLine();
                            System.out.println("Está escrito no arquivo:");
                            
            while (linha != null) {
                System.out.println(linha);
                    linha = leitura.readLine();
        }
            lerarquivo.close();
        } 
            
            catch (FileNotFoundException ex) {
                FileWriter escrever = new FileWriter("C:\\Users\\Public\\Documents\\aluno.txt");
                    PrintWriter escritor = new PrintWriter(escrever);
                        escritor.println("Nome Aqui");
                            escrever.close();

            System.out.println("Arquivo criado!\n");
                main(args);
        }
    }
}
