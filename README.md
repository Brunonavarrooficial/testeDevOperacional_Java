## Análise do Código Java

- Teste Técnico de Análise de Código
    - regra de negócio
    - código
    - boas práticas
    - estruturade dados
    - experiência do usuário

#

A) Regras de Negócio:
1. **Cada empresa tem sua taxa (comissão do sistema) para as transações:**
   - A taxa da empresa é definida na classe `Empresa` através do atributo `taxa`.

2. **Além do administrador e a própria empresa, nenhum outro usuário poderá ver informações da empresa (além do nome):**
   - Essa restrição não parece estar implementada no código atual. Precisaria ser adicionada uma verificação nas partes do código onde as informações da empresa são exibidas.

3. **Ao finalizar uma compra, o cliente deve ver um resumo da mesma:**
   - A criação e exibição do resumo da compra estão sendo realizadas na função `criarVenda()`.

4. **O saldo da empresa deve ser alterado já refletindo as taxas:**
   - O saldo da empresa é atualizado na função `criarVenda()` após calcular a comissão do sistema.

5. **A empresa deve vender apenas produtos que ela esteja relacionada:**
   - Isso parece estar sendo implementado corretamente, pois cada produto possui uma referência para a empresa que o vende.

6. **A empresa poderá ver a taxa de comissão de sistema em cada venda (ao listar suas vendas):**
   - As vendas estão sendo listadas na função `executar()` dentro do caso em que o usuário logado é uma empresa. No entanto, a taxa de comissão do sistema não está sendo exibida juntamente com os detalhes da venda. Seria necessário incluir a taxa de comissão ao exibir as informações de cada venda.
   - foi adicionado um metodo para formatação das casas decimais
   - foi acrecentado um for para percorrer os produtos individualmente.

B) Código e Boas Práticas:

#### Classe `Main.java`:

1. No primeiro `switch` em que a empresa está logada, é importante adicionar o comando `break;` após cada `case` para evitar que o programa execute os outros casos.

2. No segundo `switch` em que um cliente está logado, é necessário adicionar o `break;` também após cada `case`.

3. No segundo `case` do `switch` quando a empresa está logada, você está chamando a função `executar()` dentro do próprio `case`. Isso pode levar a recursões indesejadas. Seria melhor remover essa chamada e colocá-la fora do `switch`, após o fechamento do bloco `switch`.

#### Classe `Usuario.java`:

1. A função `IsAdmin()` poderia ser renomeada para `isAdmin()` para seguir as convenções de nomenclatura Java. Onde os métodos começam com letras minúsculas.

2. A função `IsEmpresa()` e `IsCliente()` também poderiam ser renomeadas para `isEmpresa()` e `isCliente()`, respectivamente.

#### Classe `Venda.java`:

1. O atributo `código` poderia ser renomeado para `codigo` para seguir as convenções de nomenclatura Java.

#### Classe `Produto.java`:

1. O construtor padrão da classe `Produto` está vazio sem sobrecarga ou injeção de dependencia. Talvez você possa removê-lo, uma vez que um construtor personalizado já foi definido.

#### Classe `Cliente.java` e `Empresa.java`:

1. Não foram encontrados problemas com as classes `Cliente` e `Empresa`.

C) Dicas para o programador refatorar no código:

1. **Nomes de Métodos e Variáveis**: Em geral, os nomes de métodos e variáveis estão em conformidade com as convenções de nomenclatura Java (começam com letra minúscula). No entanto, o método `executar` poderia ser renomeado para algo mais descritivo, já que esse nome não fornece muitas informações sobre o que o método faz.

2. **Chamadas Recursivas em** `executar()`: O método `executar()` é chamado recursivamente em vários pontos do código. Isso pode levar a um crescimento descontrolado da pilha de chamadas, o que pode causar problemas em casos de uso intensivo. Considere redesenhar a lógica para evitar chamadas recursivas desnecessárias.

3. **Fechamento de Recursos**: Em relação à classe `Scanner`, que é usada para entrada do usuário, é uma boa prática fechá-la após o uso para evitar vazamento de recursos. Isso pode ser feito usando o método `close()` no final do programa ou ao sair do escopo onde o `Scanner` é utilizado.

4. **Separação de Responsabilidades**: A classe `Main` parece estar fazendo muitas coisas, incluindo a interação com o usuário, manipulação de dados e lógica de negócios. Considere separar as responsabilidades em classes mais especializadas para facilitar a manutenção e o entendimento do código.