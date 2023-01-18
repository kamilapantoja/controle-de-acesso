### Termos e acordos

Ao iniciar este projeto, você concorda com as diretrizes do Código de Ética e Conduta e do Manual da Pessoa Estudante da Trybe.

---

# Boas vindas ao repositório do desafio da Aceleração Java!

Você já usa o GitHub diariamente para desenvolver os exercícios, certo? Agora, para desenvolver o desafio, você deverá seguir as instruções a seguir. Fique atento a cada passo, e se tiver qualquer dúvida, nos envie por _Slack_! #vqv 🚀

Aqui você vai encontrar os detalhes de como estruturar o desenvolvimento do seu desafio a partir deste repositório, utilizando uma branch específica e um _Pull Request_ para colocar seus códigos.

---
# Instruções para entregar seu projeto

## Não se esqueça de consultar as documentações!

⚠️ **Importante**:

Esse projeto tem como intuito te treinar para ter mais familiaridade com a documentação de aplicações, por tanto, poderão haver alguns comandos ou atributos que não estão no curso, mas que devem ser descritos no decorrer dos requisitos.

Nesses casos, é importante se atentar a aquilo que o requisito pede, e lembrar sempre de utilizar a [documentação oficial](https://docs.oracle.com/en/java/javase/11/) do Java para pesquisar detalhes sobre comandos.


## Antes de começar a desenvolver

Lembre-se que você pode consultar nosso conteúdo sobre [Git & GitHub](https://course.betrybe.com/intro/git/) sempre que precisar!

1. Clone o repositório
  * Por exemplo: `git clone git@github.com:tryber/desafio-aceleracao.git`
  * Entre no diretório do repositório que você acabou de clonar:
    * neste caso `cd desafio-aceleracao`

2. Instale as dependências:
    * `mvn install`

3. Crie uma branch a partir da branch `main`

  * Verifique que você está na branch `main`
    * Exemplo: `git branch`
  * Se não estiver, mude para a branch `main`
    * Exemplo: `git checkout main`
  * Agora, crie uma branch onde você vai guardar os commits do seu desafio
    * Você deve criar uma branch no seguinte formato: `nome-de-usuario-nome-do-desafio`
    * Exemplo:
      * `git checkout -b joaozinho-acc-java-sample`

4. Adicione a sua branch com o novo `commit` ao repositório remoto

  - Usando o exemplo anterior:
    - `git push -u origin joaozinho-acc-java-sample`

5. Crie um novo `Pull Request` _(PR)_
  * Vá até a aba de _Pull Requests_ deste repositório no GitHub
  * Clique no botão verde _"New pull request"_
  * Clique na caixa de seleção _"Compare"_ e escolha a sua branch **com atenção**
  * Clique no botão verde _"Create pull request"_
  * Adicione uma descrição para o _Pull Request_ e clique no botão verde _"Create pull request"_
  * **Não se preocupe em preencher mais nada por enquanto!**
  * Volte até a página de _Pull Requests_ do repositório e confira que o seu _Pull Request_ está criado

 ⚠️ **Lembre-se do CheckStyle! Deixe seu Eclipse configurado para arrumar o estilo automaticamente. Qualquer dúvida, volte no conteúdo.**

---

## Durante o desenvolvimento

* ⚠ **PULL REQUESTS COM ISSUES NO CHECKSTYLE NÃO SERÃO AVALIADAS, ATENTE-SE PARA RESOLVÊ-LAS ANTES DE FINALIZAR O DESENVOLVIMENTO!** ⚠

* Faça `commits` das alterações que você fizer no código regularmente

* Lembre-se de sempre após um (ou alguns) `commits` atualizar o repositório remoto

* Os comandos que você utilizará com mais frequência são:
  1. `git status` _(para verificar o que está em vermelho - fora do stage - e o que está em verde - no stage)_
  2. `git add` _(para adicionar arquivos ao stage do Git)_
  3. `git commit` _(para criar um commit com os arquivos que estão no stage do Git)_
  4. `git push -u origin nome-da-branch` _(para enviar o commit para o repositório remoto na primeira vez que fizer o `push` de uma nova branch)_
  5. `git push` _(para enviar o commit para o repositório remoto após o passo anterior)_

---

## Depois de terminar o desenvolvimento (opcional)

Para **"entregar"** seu projeto, siga os passos a seguir:

* Vá até a página **DO SEU** _Pull Request_, adicione a label de _"code-review"_ e marque seus colegas
  * No menu à direita, clique no _link_ **"Labels"** e escolha a _label_ **code-review**
  * No menu à direita, clique no _link_ **"Assignees"** e escolha **o seu usuário**
  * No menu à direita, clique no _link_ **"Reviewers"** e digite `students`, selecione o time `tryber/students-sd-0x`

Se ainda houver alguma dúvida sobre como entregar seu projeto, [aqui tem um video explicativo](https://vimeo.com/362189205).

---

# Requisitos do desafio

# Descrição do desafio: Sistema de Controle de Acesso

Que sucesso! 👏 Chegou até você uma demanda para desenvolver um sistema de controle de acesso inteligente para um estabelecimento. Ficou combinado com o cliente que o sistema, ao ser finalizado, deve apresentar um relatório que divida as pessoas que acessaram o estabelecimento em três categorias:

1. Pessoas menores de 18 anos,
2. Pessoas adultas (entre 18 e 49 anos), e
3. Pessoas a partir de 50 anos.

Com esse relatório, o cliente poderá tomar decisões baseadas em informações para alcançar ou fidelizar sua clientela. Esse sistema deve apresentar um menu, no console, indicando a opção de acessar o estabelecimento e a opção de finalizar o sistema e mostrar um relatório. O fluxo do sistema é definido seguindo duas etapas principais que devem ser executadas na seguinte ordem:

1. **Inserir idade de pessoa cliente no sistema:** essa etapa se repete até que a opção de finalizar o sistema seja escolhida. A idade das pessoas clientes deve ser armazenada em um array de tamanho dinâmico, já que não sabemos quantas pessoas clientes chegarão ao estabelecimento. Dica: utilize a classe `ArrayList` do Java para a criação e manipulação de arrays de tamanho dinâmico. Para mais informações você pode consultar o site da [W3Schools](https://www.w3schools.com/java/java_arraylist.asp) ou [JavaPoint](https://www.javatpoint.com/java-arraylist), ou então verificar a documentação da Oracle.

2. **Finalizar o sistema e mostrar o relatório:** nessa etapa, o laço de repetição deve ser terminado e então o relatório deve ser impresso no console. O relatório deve conter o total de pessoas que acessaram o estabelecimento, e também o número de pessoas menores de 18 anos, o número de pessoas adultas (entre 18 e 49 anos) e o número de pessoas a partir de 50 anos que acessaram o estabelecimento. O relatório também deve calcular, em relação ao total de pessoas, a porcentagem delas que eram menores de 18, que eram adultas (entre 18 e 49), e as a partir de 50.

A imagem abaixo mostra o fluxo que o programa deve seguir:

![SistemaFluxograma](img/controle-acesso.png)

Esse sistema deve ter a classe `Principal`, contendo nela o método `main`. No método `main`, é preciso ter uma instância da classe `Scanner` para poder ler as entradas da pessoa usuária pelo console e um laço de repetição que representam menu da aplicação. Dessa forma podemos registrar a entrada de todas as pessoas que chegarem durante o expediente.

- O menu deve ter o formato:

    ```
    Entre com o número correspondente à opção desejada:
    1 - Acessar o estabelecimento
    2 - Finalizar sistema e mostrar relatório
    ```
Se a pessoa usuária entrar com o valor 1 (que indica que ela quer acessar o estabelecimento), então a mensagem `Entre com a idade:` será impressa no console. Em seguida, depois de inserir a idade da pessoa cliente e pressionar enter, aparecerá uma das mensagens listadas abaixo:

- `Pessoa cliente menor de idade, catraca liberada!`: se a idade da pessoa inserida for menor que 18 anos.

- `Pessoa adulta, catraca liberada!`: se a idade da pessoa inserida for igual ou maior que 18 anos, e menor ou igual a 49 anos.

- `Pessoa adulta a partir de 50, catraca liberada!`: se a idade da pessoa inserida for a partir de 50 anos.

Depois que a mensagem for impressa, então deverá retornar ao estado inicial do menu. Supondo que a idade da primeira pessoa seja 18 anos, um exemplo do conteúdo do console depois de inserir a idade da primeira pessoa cliente será:
```
Entre com o número correspondente à opção desejada:
1 - Acessar o estabelecimento
2 - Finalizar sistema e mostar relatório
1
Entre com a sua idade:
18
Pessoa adulta, catraca liberada!
Entre com o número correspondente à opção desejada:
1 - Acessar o estabelecimento
2 - Finalizar sistema e mostrar relatório
```
Esse ciclo se repete até a opção 2 ser escolhida, o que indica que a pessoa usuária quer finalizar o expediente e imprimir o relatório.

⚠️🔴**DICA: use uma variável do tipo `short` para armazenar a opção inserida pela pessoa usuária, já que é um valor númerico de pequena escala.** 🔴⚠️

Depois de implementada a parte do menu, você deverá implementar a parte final, que é o relatório. Como dito anteriormente, o relatório é uma parte fundamental do sistema, pois provê informações para que a pessoa proprietária do estabelecimento possa traçar estratégias para aumentar sua clientela e, consequentemente, aumentar seu lucro, gerando mais empregos, impactando a vida de muitas pessoas. Consegue ver a importância de um sistema bem desenvolvido?

O relatório deve ser impresso no console quando a opção 2 for selecionada. Supondo que 200 pessoas visitaram o estabelecimento, o relatório deve conter as seguintes informações:

- Número total de pessoas que visitaram o estabelecimento: nesse caso, esse valor deverá ser 200.

- Número de pessoas menores de 18 anos que visitaram o estabelecimento: supondo que, das 200 pessoas, 20 eram menores de 18 anos, então no relatório esse valor deverá ser 20.

- Número de pessoas adultas (entre 18 e 49 anos) que visitaram o estabelecimento: supondo que, das 200 pessoas, 150 eram adultas entre 18 e 49 anos, então esse valor deverá ser 150.

- Número de pessoas a partir de 50 anos que visitaram o estabelecimento: supondo que, das 200 pessoas, 30 tinham a partir de 50, então esse valor deverá ser 30.


O relatório também deve calcular a porcentagem de pessoas em cada categoria em relação ao total de pessoas. Ainda seguindo a suposição anterior, o total de visitas ao estabelecimento foi de 200 pessoas, então o relatório na parte dos números percentuais deve apresentar:

- Percentual de pessoas menores de 18 anos que visitaram o estabelecimento: supondo que, das 200 pessoas, 20 eram menores de 18 anos, então no relatório esse valor deverá ser 10.0%.

- Número de pessoas adultas (entre 18 e 49 anos) que visitaram o estabelecimento: supondo que, das 200 pessoas, 150 eram adultas entre 18 e 49 anos, então esse valor deverá ser 75.0%.

- Número de pessoas a partir de 50 anos que visitaram o estabelecimento: supondo que, das 200 pessoas, 30 tinham a partir de 50, então esse valor deverá ser 15.0%.

Para essa suposição, a saída do relatório deve ser similar à saída abaixo:
```
----- Quantidade -----
menores: 20
adultas: 150
a partir de 50: 30

----- Percentual -----
menores: 10.0%
adultas: 75.0%
a partir de 50: 15.0%

TOTAL: 200
```

## Restrições

- O valor percentual deve ter duas casas decimais, exceto se for zero, então pode ser apenas uma casa decimal, como exposto no exemplo acima.
- Caso a opção inserida pela pessoa usuária seja um valor diferente de 1 ou de 2, a mensagem `Entre com uma opção válida!` deve ser impressa no console, e o menu voltar para o estado inicial.

⚠️🔴**DICA: para fazer com que o valor do tipo `float` ou `double` tenha apenas duas casas decimais, pesquise sobre a classe `DecimalFormat`.** 🔴⚠️

## Exemplo

Aqui temos um outro exemplo da saída do relatório, considerando que 173 pessoas visitaram o estabelecimento, das quais 34 eram menores de 18 anos, 108 eram adultas entre 18 e 49 anos de idade, e 31 tinham a partir de 50 anos:
```
----- Quantidade -----
menores: 34
adultas: 108
a partir de 50: 31

----- Percentual -----
menores: 19.65%
adultas: 62.43%
a partir de 50: 17.92%

TOTAL: 173
```

Ótimo trabalho! Lembre-se de surpreender positivamente o seu cliente!


---

# Avisos Finais

Ao finalizar e submeter o desafio, não se esqueça de avaliar sua experiência preenchendo o formulário. Leva menos de 3 minutos!

Link: [Formulário](https://be-trybe.typeform.com/to/PsefzL2e)

O avaliador automático não necessariamente avalia seu projeto na ordem em que os requisitos aparecem no readme. Isso acontece para deixar o processo de avaliação mais rápido. Então, não se assuste se isso acontecer, ok?

---
