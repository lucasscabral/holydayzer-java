public class App {
    public static void main(String[] args) {

        Feriados listaFeriados = new Feriados();
        listaFeriados.addListaFeriados();

        System.out.println(listaFeriados.listaTodosFeriados());

        System.out.println(listaFeriados.existeFeriado("08/06/2023"));
    }
}
