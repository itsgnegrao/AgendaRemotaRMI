# AgendaRemotaRMI
Agenda Remota Simples Programada em Java Utilizando RMI (Remote Method Invocation).

## Get Start
Clone ou faça o Download do projeto em .zip (via terminal/manual) para sua maquina.
- Clone:
  - Execute o comando clone e acesse a pasta do projeto:
    ```
    git clone https://github.com/itsgnegrao/AgendaRemotaRMI.git
    cd AgendaRemotaRMI/
    ```
- Download:
  - Execute no Terminal de comando para baixar o arquivo  .zip:
    ```
    wget https://github.com/itsgnegrao/AgendaRemotaRMI/archive/master.zip
    ```
  - Descompacte e acesse a pasta do projeto:
    ```
    unzip -j AgendaRemotaRMI-master.zip -d AgendaRemotaRMI
    cd AgendaRemotaRMI/
    ```
### Passos para Execução:
- Execute o seguinte comando no terminal para compilar as classes necessárias para execução do RMI:
  ```
  javac Servidor.java AgendaGUI.java Compromisso.java CompromissoGUI.java AcessoImplementacao.java Acesso.java
  ```
- Execute o Servidor:
  ```
  java Servidor
  ```
- Abra outro Terminal e execute a Agenda:
  ```
  java AgendaGUI
  ```

## Observações
Se você ja está perdido a ponto de ter chegado até aqui, vá em frente e se afunde de uma vez! :trollface:
## Autor
[Gabriel Negrão Silva](https://github.com/itsgnegrao). :alien:
