import java.util.HashMap;
import java.util.Map;

public class Feriados {
  Map<String, String> feriados = new HashMap<String, String>();

  String existeFeriado(String data) {

    if (feriados.containsKey(data)) {
      return String.format("O Feriado nesta data é: %s", data);
    }
    return "Não há feriado nesta data";
  }

  void addListaFeriados() {
    this.feriados.put("01/01/2023", "Confraternização mundial");
    this.feriados.put("21/02/2023", "Carnaval");
    this.feriados.put("17/04/2023", "Páscoa");
    this.feriados.put("21/04/2023", "Tiradentes");
    this.feriados.put("01/05/2023", "Dia do trabalho");
    this.feriados.put("08/06/2023", "Corpus Christi");
    this.feriados.put("07/09/2023", "Independência do Brasil");
    this.feriados.put("12/10/2023", "Nossa Senhora Aparecida");
    this.feriados.put("02/11/2023", "Finados");
    this.feriados.put("15/11/2023", "Proclamação da República");
    this.feriados.put("25/12/2023", "Natal");
  }

  void listaTodosFeriados() {
    feriados
        .forEach((key, value) -> System.out.println(String.format("Data: %s corresponde ao feriado: %s", key, value)));
  }

}
