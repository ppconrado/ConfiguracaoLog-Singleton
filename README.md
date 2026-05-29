✅ Conceito aplicado

Singleton: garante que exista apenas uma instância do logger na aplicação.
Enum para níveis de log: evita erros com strings.
Formatação da mensagem: inclui timestamp e nível.

Um arquiteto precisa criar um componente para realizar os logs de sua aplicaçao. O log, recebera inicialmente apenas uma string de acordo com os levels:

- INFO - DEBUG - WARN - ERROR

Formate a mensagem para representar o tipo de log

🚀 Melhorias possíveis (se quiser evoluir)

Escrever os logs em arquivo
Adicionar cores no console
Permitir níveis mínimos (ex: só WARN+)
Tornar thread-safe com eager initialization ou enum singleton


## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
