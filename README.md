<p align="center">
  <pre>
    🔴 🟩 🟩
    🟩 🟩 
    🟩 🟩 🟩
    🟩 🟩
    ╔════════════════════════════════════════════════╗
    ║  I N S T I T U T O   F E D E R A L  ACOPIARA   ║
    ╚════════════════════════════════════════════════╝
  </pre>

  <table>
  <tr>
    <td><img src="https://img.shields.io/badge/Java-24%2B-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"></td>
    <td><img src="https://img.shields.io/badge/Packages-Maven%20%7C%20JAR-blue?style=for-the-badge&logo=apachemaven&logoColor=white"></td>
    <td><img src="https://img.shields.io/badge/System-Windows-0078D6?style=for-the-badge&logo=windows&logoColor=white"></td>
  </tr>
  <tr>
    <td><img src="https://img.shields.io/badge/Pull%20Requests-0-blue?style=for-the-badge&logo=github&logoColor=white"></td>
    <td><img src="https://img.shields.io/badge/Coverity%20Scan-Passing-brightgreen?style=for-the-badge"></td>
  </tr>
</table>

# Scanner de Phishing Inteligente

Scanner de Phishing Inteligente é um sistema desenvolvido em Java para detectar possíveis mensagens fraudulentas (phishing) através da análise textual de e-mails e arquivos `.txt`.

O projeto combina técnicas de:
- análise por palavras-chave
- normalização textual avançada
- heurísticas de comportamento suspeito

permitindo identificar tentativas de phishing mesmo quando o texto tenta ocultar informações através de:
- leetspeak
- caracteres especiais
- acentuação
- excesso de caixa alta
- links suspeitos
- mistura de símbolos

O sistema simula mecanismos básicos utilizados em detectores reais de segurança digital e serviços modernos de e-mail.

---

# Objetivos do Projeto

- Detectar palavras e frases frequentemente utilizadas em ataques de phishing
- Identificar padrões suspeitos em mensagens eletrônicas
- Neutralizar técnicas de evasão textual
- Detectar links potencialmente perigosos
- Aplicar análise heurística em mensagens
- Calcular automaticamente uma pontuação de risco
- Classificar mensagens como:
  - ✔ Baixo risco
  - ⚠ Possível phishing
  - 🚨 Alto risco de phishing
- Aplicar conceitos de Programação Orientada a Objetos (POO)
- Simular funcionalidades presentes em filtros modernos de e-mail

---

# Features

## 🔍 Detector por Palavras-Chave

- Banco de palavras suspeitas utilizando `HashMap`
- Detecção de palavras individuais
- Detecção de frases completas
- Sistema de pontuação por peso
- Classificação automática de risco

---

## 🛡 Normalização Textual Avançada

O sistema realiza automaticamente:

- remoção de acentos
- conversão para letras minúsculas
- remoção de caracteres especiais
- normalização de espaços
- detecção e conversão de leetspeak

Exemplo:

```text
CL1QU3 AQU1!!!
s3nh4
b4nco
