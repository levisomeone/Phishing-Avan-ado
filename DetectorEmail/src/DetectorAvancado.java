public class DetectorAvancado {

    public void analisar(String textoOriginal) {

        int score = 0;

        System.out.println("\n==== ANÁLISE AVANÇADA ====\n");

        if (detectarLinks(textoOriginal)) {
            System.out.println("✔ Links suspeitos detectados");
            score += 4;
        }

        if (detectarCaixaAlta(textoOriginal)) {
            System.out.println("✔ Excesso de letras maiúsculas");
            score += 3;
        }

        if (detectarSimbolos(textoOriginal)) {
            System.out.println("✔ Muitos símbolos suspeitos");
            score += 3;
        }

        if (detectarUrgencia(textoOriginal)) {
            System.out.println("✔ Linguagem de urgência detectada");
            score += 4;
        }

        if (detectarLeetspeak(textoOriginal)) {
            System.out.println("✔ Leetspeak detectado");
            score += 5;
        }

        System.out.println("\nPontuação Avançada: " + score);

        if (score >= 12)
            System.out.println("⚠️ ALTO RISCO DE PHISHING");
        else if (score >= 5)
            System.out.println("⚠️ POSSÍVEL PHISHING");
        else
            System.out.println("✔ BAIXO RISCO");
    }

    private boolean detectarLinks(String texto) {

        texto = texto.toLowerCase();

        return texto.contains("http")
                || texto.contains("www")
                || texto.contains(".com")
                || texto.contains(".xyz");
    }

    private boolean detectarCaixaAlta(String texto) {

        int maiusculas = 0;
        int letras = 0;

        for (char c : texto.toCharArray()) {

            if (Character.isLetter(c)) {

                letras++;

                if (Character.isUpperCase(c))
                    maiusculas++;
            }
        }

        if (letras == 0)
            return false;

        double porcentagem = (double) maiusculas / letras;

        return porcentagem > 0.5;
    }

    private boolean detectarSimbolos(String texto) {

        int simbolos = 0;

        for (char c : texto.toCharArray()) {

            if ("!@#$%&*".indexOf(c) != -1)
                simbolos++;
        }

        return simbolos >= 5;
    }

    private boolean detectarUrgencia(String textoOriginal) {

        String texto = NormalizarTexto.normalizar(textoOriginal);

        return texto.contains("urgente")
                || texto.contains("imediatamente")
                || texto.contains("agora")
                || texto.contains("bloqueado")
                || texto.contains("suspenso");
    }

    private boolean detectarLeetspeak(String texto) {

        return texto.matches(".*[013457@\\$].*");
    }
}