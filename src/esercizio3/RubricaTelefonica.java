package esercizio3;

import java.util.HashMap;

public class RubricaTelefonica {
    private HashMap<String, Integer> contatti;


    public RubricaTelefonica() {
        this.contatti = new HashMap<>();
    }


    public void aggiungiContatto(String nome, Integer numero) {
        contatti.put(nome, numero);
    }


    public void rimuoviContatto(String nome) {
        contatti.remove(nome);
    }


    public String cercaPerNumero(int numero) {
        if (contatti.containsValue(numero)) {
            for (String nome : contatti.keySet()) {
                if (contatti.get(nome).equals(numero)) {
                    return nome;
                }
            }
        }
        return null;
    }


    public Integer cercaPerNome(String nome) {
        return contatti.get(nome);
    }


    public void stampaTuttiContatti() {
        for (String nome : contatti.keySet()) {
            System.out.println("Nome: " + nome + ", Telefono: " + contatti.get(nome));
        }
    }
}
