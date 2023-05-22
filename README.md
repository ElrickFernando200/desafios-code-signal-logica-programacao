# Desafios Lógica de Programação plataforma CodeSignal

[Link:] https://codesignal.com/
               
# Inadmissivel Pagamento em excesso

Depois de ingressar recentemente no grupo de desenvolvedores de testes beta da Instacart,
você decide experimentar a nova API. Você sabe que a API retorna strings prontas para exibição específicas do item,
como **[10.0% higher than in-storeou, 5.0% lower than in-storeque]** informam aos usuários quando o preço de um item é diferente daquele na loja.
Mas você deseja estender essa funcionalidade dando às pessoas uma noção melhor de quanto pagarão a mais por todo o carrinho de compras.

Seu aplicativo permite que um usuário decida o valor total **X** que deseja pagar via Instacart sobre os preços da loja.
Isso você chama de sensibilidade ao preço.

 Seu trabalho é determinar se um determinado cliente estará disposto a pagar pelos itens fornecidos em seu carrinho
com base em sua sensibilidade de preço **X** declarada.
## Exemplo:
>**prices = [110, 95, 70],**

>**notes = ["10.0% higher than in-store", 
 >"5.0% lower than in-store", 
 >"Same as in-store"]**
         
 >e **X = 5**, a saída deve ser
>solution(prices, notes, x) = **true.**

Os preços na loja do primeiro e do segundo itens são **100**, e o preço do terceiro item é **70**,
o que significa que o cliente está pagando a mais **10 - 5 + 0 = 5,** 
o que está disposto a fazer com base em sua sensibilidade ao preço.


>**prices = [48, 165],**

>**notes = ["20.00% lower than in-store", 
         >"10.00% higher than in-store"]**

>e **X = 2** , a saída deve ser
solution(prices, notes, x) = **false.**

O preço na loja do primeiro item é **60**, e o do segundo item é **150.**
O pagamento a maior é igual a **15 - 12 = 3**, que é muito para o cliente estar disposto a pagar.



# Palíndromo

Dada a string, verifique se é um palíndromo .

## Exemplo

**Para** 
>inputString = "aabaa", a saída deve ser
>solution(inputString) = true;

**Para** 
>inputString = "abac", a saída deve ser
>solution(inputString) = false;

**Para**
>inputString = "a", a saída deve ser
>solution(inputString) = true.


# Produtos de Elementos Adjacentes
Dado um array de inteiros, encontre o par de elementos adjacentes que tem o maior produto e retorne esse produto.

## Exemplo

**Para**
>inputArray = [3, 6, -2, -5, 7, 3], a saída deve ser
>solution(inputArray) = 21.

**7 e 3** produz o maior produto.

# Tornar Array Consecutivo
Ratiorg ganhou **statues**  de tamanhos diferentes como presente do CodeMaster em seu aniversário, 
cada estátua com um tamanho inteiro não negativo. Como ele gosta de fazer as coisas perfeitas,
ele quer organizá-las do menor para o maior, de modo que cada estátua seja maior que a anterior exatamente em **1.**
Ele pode precisar de algumas estátuas adicionais para conseguir isso. Ajude-o a descobrir o número mínimo de estátuas
adicionais necessárias.

# Exemplo:
**Para**

>statues = **[6, 2, 3, 8]**

> a saída deve ser solution(statues) = **3**.

>Ratiorg precisa de estátuas de tamanhos **4, 5 e 7.**



  

                  
