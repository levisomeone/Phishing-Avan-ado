
Scanner de Phishing Inteligente

Scanner de Phishing Inteligente é um sistema desenvolvido em Java para detectar possíveis mensagens fraudulentas (phishing) através da análise textual de e-mails e arquivos .txt.

O projeto combina:

análise por palavras-chave
normalização textual avançada
heurísticas de comportamento suspeito

permitindo detectar tentativas de phishing mesmo quando o texto utiliza técnicas de disfarce como:

leetspeak
caracteres especiais
caixa alta excessiva
links suspeitos
mistura de símbolos
Objetivos do Projeto
Detectar palavras e frases comuns em ataques de phishing
Identificar padrões suspeitos em mensagens
Neutralizar técnicas de evasão textual
Detectar links potencialmente perigosos
Calcular pontuação de risco automaticamente
Classificar mensagens como:
Baixo risco
Possível phishing
Alto risco de phishing
Aplicar conceitos de Programação Orientada a Objetos
Simular mecanismos utilizados por detectores reais de e-mail
Features
Banco de palavras suspeitas utilizando HashMap
Normalização textual avançada
remoção de acentos
conversão para minúsculas
remoção de símbolos
detecção de leetspeak
Sistema de pontuação por peso
Detecção de frases completas e palavras individuais
Leitura de arquivos .txt
Relatório formatado com printf
Classificação automática de risco
Detector heurístico avançado
links suspeitos
excesso de caixa alta
muitos símbolos especiais
linguagem de urgência
leetspeak
Separação de responsabilidades em classes
Compatível com boas práticas de POO
Tecnologias Utilizadas
Java
IntelliJ IDEA
HashMap
Regex
Normalizer API
Programação Orientada a Objetos
Estrutura do Projeto
📁 src/
│
├── 🟦 Main.java
├── 🔵 BancoPhishing.java
├── 🔵 NormalizarTexto.java
└── 🔴 DetectorAvancado.java

📄 email1.txt
📄 email2.txt
📄 email3.txt
📄 email4.txt
📄 email5.txt
Como Funciona

O sistema realiza duas etapas principais:

1. Detector por Palavras-Chave

O texto do e-mail é normalizado e comparado com um banco de palavras e frases suspeitas.

Cada termo possui:

quantidade de ocorrências
peso de risco

A soma gera uma pontuação parcial.

2. Detector Heurístico Avançado

O sistema também analisa comportamentos suspeitos como:

links desconhecidos
excesso de letras maiúsculas
muitos símbolos especiais
linguagem de urgência
padrões leetspeak

Essas características aumentam a pontuação final da análise.

Exemplos Detectados

O sistema consegue detectar mensagens com:

CL1QU3 AQU1!!!
s3nh4
c0nta
b4nco

Convertendo automaticamente para:

clique aqui
senha
conta
banco
Técnicas Anti-Evasão Implementadas

O sistema consegue neutralizar:

Leetspeak
Caracteres especiais
Escrita em caixa alta
Acentuação
Mistura de símbolos
Tentativas de disfarce textual
Exemplo de Saída
==== RELATÓRIO DE PALAVRAS ====

senha                    |  2 ocorrências |   6 pontos
conta                    |  1 ocorrências |   2 pontos
clique aqui              |  1 ocorrências |   3 pontos

Total de Pontos: 11

⚠️ POSSÍVEL PHISHING


==== ANÁLISE AVANÇADA ====

✔ Links suspeitos detectados
✔ Linguagem de urgência detectada
✔ Leetspeak detectado

Pontuação Avançada: 13

⚠️ ALTO RISCO DE PHISHING
