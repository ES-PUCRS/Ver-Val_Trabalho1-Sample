# Verificação e Validação de Software
Professor Bernardo Copstein  
Introdução ao Teste Unitário
## Exercícios sobre uso básico de JUnit para entregar

1. Uma  indústria  de  chocolate  tem  de  despachar  para  seus  clientes  pacotes  com  diferentes pesos.  As  barras  são  produzidas  com  dois  pesos:  1Kg  e  5Kg.  Precisa-se  saber  quantas barras  de  cada  peso  deve-se  enviar  para  cada  cliente  sabendo  que  a  prioridade  é  enviar barras  de  5Kg.  A  classe  “Encomenda”  que  segue  possui  um  método  chamado “qtdadeBarras”.  Este  retorna  um  arranjo  com  duas  posições:  a  primeira  indica  a quantidade  de  barras  de  5Kg  e  a  segunda  a  quantidade  de  barras  de  1Kg  necessárias para  completar  a  encomenda.  O  “esqueleto  da  classe’  pode  ser  visto  abaixo. Implemente  um  driver  de  teste  capaz  de  testar  a  classe  adequadamente.  Em  seguida implemente a classe e verifique a qualidade de sua implementação

~~~Java
class Encomenda{
	int[] qtdadeBarras(int peso){
			...
	}
}
~~~

## Pre-requisitos
1. Instalar o Gradle 6.6.1 (adicionar nas variaveis de ambiente do sistema);
2. Java 1.8.0 (adicionar o JAVA_HOME nas variaveis de ambiente do sistema);

## Como executar o código groovy
1. Abrir o terminal na pasta raiz do projeto
2. Executar o comando ´gradle run --args"[Kgs de chocolate]"´

## Como executar os testes
1. Abrir o terminal na pasta raiz do projeto
2. Executar o comando ´gradle test´

Observações:
* Não tenho certeza quanto a necessidade de baixar e instalar o package da linguagem Groovy. Eu tenho instalado, mas acredito que apenas faça a função de me permitir compilar e executar o programa pelo cmd (fora do gradle);
* Eu utilizo a versão 6.6.1 do Gradle, não tenho certeza até qual versão anterior as dependencias funcionem. Recomendo utilizar a 6.6.1 (última disponível);

*Comandos gradle*
* Gradle build - cria o artefato .jar/.war (executando os testes)
* Gradle run - Executa o programa
* Gradle test - Executa os testes unitários do projeto

**Todos os comandos gradle compilam o projeto automagicamente**