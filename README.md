<div align="center">
  <h1><strong>Exercício de uma Escola Inteligente em Java 🏫</h1>
  </div>

## <strong>🧰Tecnologias, linguagens e ferramentas:</strong><br />
  <div align="center">
    <a href="https://github.com/PFonsecaFV/PFonsecaFV">
    <img src="https://github.com/PFonsecaFV/PFonsecaFV/blob/main/src/icons/ic_java.svg" width="60" fill="none" />
    <img src="https://github.com/PFonsecaFV/PFonsecaFV/blob/main/src/icons/ic_maven.svg" width="60" fill="none" />
    <img src="https://github.com/PFonsecaFV/PFonsecaFV/blob/main/src/icons/ic_junit.svg" width="60" fill="none" />
  </a>
  </div>
  

## <strong>🎯Habilidades Utilizadas</strong><br />

- Utilização de classes em Java.
- Manipulação de tipos primitivos e não primitivos.
- Uso de estruturas de repetição.
- Uso de estruturas condicionais.
- Uso do Scanner para entrada de dados.
- Prática de simulação de funcionalidades.
- Criação de funções.
- Uso de arrays, incluindo o uso do ArrayList.
- Uso do DecimalFormat para formatar números decimais.

Este exercício Escola Inteligente é uma aplicação Java que interage através do terminal e oferece funcionalidades para diferentes departamentos da escola.

## 📝Orientações para instalar e testar o projeto

1. Crie um diretório usando o comando mkdir e entre no diretório:
	```bash
	mkdir patrick-fonseca-java-exercicios && cd patrick-fonseca-java-exercicios
	```
 2. Clone o repositório e use o comando no terminal:
	```bash
	git clone git@github.com:PFonsecaFV/java-exercicio-escola-inteligente.git
	```
3. Acesse o diretório do projeto:
	```bash
	cd java-exercicio-escola-inteligente
	```
4. Instale suas dependências:
	```bash
	mvn install
	```

## ✅ O que foi desenvolvido

1. **Calcular a idade em dias para o departamento Pessoa Estudante:**
    - Implementei os métodos `coletarInformacoes` e `calcularIdadeEmDias` na classe `PessoaEstudante`.
    - O método `coletarInformacoes` lê o nome da pessoa estudante, anos, meses e dias.
    - O método `calcularIdadeEmDias` calcula e retorna a idade da pessoa estudante em dias.

2. **Calcular a média das notas de uma pessoa estudante:**
    - Implementei os métodos `coletarInformacoes` e `calcularMedia` na classe `Secretaria`.
    - O método `coletarInformacoes` lê o nome da pessoa estudante e quatro notas.
    - O método `calcularMedia` calcula e retorna a média das notas.

3. **Realizar o controle de acesso e emitir o relatório:**
    - Implementei os métodos `coletarInformacoes` e `emitirRelatorio` na classe `Portaria`.
    - O método `coletarInformacoes` registra a idade das pessoas estudantes que acessam a escola e armazena essas idades em um ArrayList dinâmico.
    - O método `emitirRelatorio` gera um relatório que inclui o número total de pessoas estudantes, o número em categorias específicas e a porcentagem em cada categoria.

## 🛠️ Testes

Para executar todos os testes basta rodar o comando:
  ```bash
  mvn test
  ```

Para executar os testes por funcionalidades desenvolvidas

Teste 01 - **Calcular a idade em dias para o departamento Pessoa Estudante**:
  ```bash
  mvn test -Dtest="PessoaEstudanteTest"
  ```

Teste 02 - **Calcular a média das notas de uma pessoa estudante**:
  ```bash
  mvn test -Dtest="SecretariaTest"
  ```

Teste 03 - **Realizar o controle de acesso e a emissão do relatório**:
  ```bash
  mvn test -Dtest="PortariaTest"
  ```

---

<div align="center">
  <h2>Patrick Fonseca</h2>
	  <a href="https://www.linkedin.com/in/PatrickFonseca/" target="_blank">
      <img src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=for-the-badge&logo=linkedin&logoColor=white" target="_blank">
    </a>
</div>
