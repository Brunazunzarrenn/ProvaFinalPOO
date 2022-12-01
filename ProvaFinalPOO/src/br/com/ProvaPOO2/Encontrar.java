package br.com.ProvaPOO2;

public class Encontrar {

        public static void main(String[] args) {

            Usuario usuario = new Usuario("Bruna", "emailBruna", "senhaBruna");
            AchadoPerdido achadoPerdido = new AchadoPerdido("tituloBruna", "descriçãoBruna", "tipoBruna", "statusBruna");
            achadoPerdido.buscarTitulo("tituloBruna");
            achadoPerdido.visualizarDetalhes();
        }
    }

