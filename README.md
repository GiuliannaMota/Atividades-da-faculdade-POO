# Atividades faculdade POO 
 Atividades de Programação Orientada a Objeto em java

## Atividade 01 
Crie uma classe chamada Conta, que represente contas bancárias. A classe deve conter como atributo o saldo da conta (um número real) e o nr da conta (inteiro). A classe deve possuir um construtor que recebe o saldo inicial para inicializar o atributo, validando se o valor é maior ou igual à zero. Caso o valor seja menor que zero, o atributo deve ser inicializado com zero, e uma mensagem de erro deve ser apresentada. Crie um programa que contenha dois objetos desta classe e utilize cada um dos três métodos:
Credito: adiciona um valor ao saldo atual;
Debito: subtrai um valor do saldo atual, garantindo que o saldo não ficará negativo. Se o débito for maior que o saldo, a operação não deve ser realizada e uma mensagem apresentada.
getSaldo: retorna o saldo.

## Atividade 02
Implementar um sistema de gerenciamento de veículos que utilize os conceitos de herança e polimorfismo. 
- Classe Base
    Crie uma classe chamada Veiculo com os seguintes atributos e métodos:
    Atributos: marca (String): A marca do veículo; modelo (String): O modelo do veículo.
    Métodos: acelerar(): Um método que imprime "O veículo está acelerando."
- Classes DerivadasCrie duas classes que herdam de Veiculo:
    Carro: Uma classe que representa um carro. Adicione o atributo quantidadeDePortas (int). Sobrescreva o método  acelerar() para imprimir "O carro está acelerando."
    Moto: Uma classe que representa uma moto. Adicione o atributo temCarenagem (boolean). Sobrescreva o método acelerar() para imprimir "A moto está acelerando.
- Classe de Teste
    Crie uma classe chamada Main com um método main. Neste método, faça o seguinte:
    Crie uma instância de Carro e uma instância de Moto.
    Use polimorfismo para armazenar esses objetos em um array do tipo Veiculo[].
