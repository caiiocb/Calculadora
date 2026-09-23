# To-Do: Projeto Calculadora (Spring Boot + HTML/CSS/JS)

## Fase 1: Configuração Inicial
- [✅] Gerar o projeto base no [Spring Initializr](https://start.spring.io/) (Dependências sugeridas: *Spring Web*).
- [✅] Inicializar o repositório Git local (`git init`).
- [✅] Abrir o projeto na sua IDE (ex: IntelliJ) e estruturar os pacotes base (`controller`, `service`, `dto`).

## Fase 2: Construção do Backend (Java + Spring Boot)
- [✅] **DTOs (Data Transfer Objects):**
    - [✅] Criar classe `CalculoRequest` (com os atributos: `numero1`, `numero2`, `operador`).
    - [✅] Criar classe `CalculoResponse` (com o atributo: `resultado`).
- [✅] **Service (Lógica de Negócio):**
    - [✅] Criar a classe `CalculadoraService`.
    - [✅] Implementar os métodos de soma, subtração, multiplicação e divisão.
    - [✅] Adicionar tratamento de erro (ex: lançar exceção ao tentar dividir por zero).
- [✅] **Controller (API REST):**
    - [✅] Criar a classe `CalculadoraController` anotada com `@RestController`.
    - [✅] Implementar um endpoint `POST /api/calcular` que recebe o `CalculoRequest`, chama o Service e retorna o `CalculoResponse`.
- [✅] **Testes de API:**
    - [✅] Testar o endpoint usando Postman, Insomnia ou uma extensão da IDE para garantir que as operações matemáticas estão retornando o JSON correto.

## Fase 3: Construção do Frontend (Arquivos Estáticos)
*Nota: Você pode colocar estes arquivos dentro da pasta `src/main/resources/static` do Spring Boot para rodar tudo no mesmo servidor (localhost:8080).*

- [ ] **HTML (`index.html`):**
    - [ ] Criar a estrutura semântica (visor da calculadora, botões numéricos de 0 a 9, botões de operações `+`, `-`, `*`, `/`, `=` e `Limpar`).
- [ ] **CSS (`style.css`):**
    - [ ] Estilizar a calculadora (sugestão: usar CSS Grid para alinhar os botões de forma simétrica).
    - [ ] Adicionar efeitos de `:hover` e `:active` nos botões para melhorar o feedback visual.
- [ ] **JavaScript (`script.js` - Lógica de Interface):**
    - [ ] Capturar os cliques dos botões.
    - [ ] Implementar a lógica de concatenar os números e operadores no visor.
    - [ ] Preparar a função que será disparada ao clicar no botão de igual (`=`).

## Fase 4: Integração (Comunicação Front-Back)
- [ ] No `script.js`, implementar a chamada assíncrona usando a API `fetch()`.
- [ ] Enviar o método `POST` para `/api/calcular` enviando os dados do visor no formato JSON.
- [ ] Capturar a resposta do backend e atualizar o visor da calculadora com o resultado.
- [ ] Tratar mensagens de erro no frontend (ex: exibir "Erro" se a divisão por zero retornar um status 400).

## Fase 5: Finalização
- [ ] Fazer testes manuais de ponta a ponta (operações longas, números decimais, limpar visor).
- [ ] Criar um arquivo `README.md` explicando o projeto, tecnologias e como rodá-lo localmente.
- [ ] Fazer o commit final e subir o repositório para o GitHub.