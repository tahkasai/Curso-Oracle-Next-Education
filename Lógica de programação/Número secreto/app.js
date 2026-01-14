//info: pode usar aspas simples ou aspas duplas
alert('Boas vindas ao jogo do número secreto'); // o alert abre uma caixa no navegador informando seja um texto 
let chute;
let numeroMaximo = 100;
let numeroSecreto = parseInt(Math.random() * numeroMaximo + 1); // atribuição da variável de número aleatório inteiro
console.log(numeroSecreto)
let tentativas = 1;

while (true) {
    chute = prompt(`Escolha um número entre 1 e ${numeroMaximo}`);
    // se chute for igual ao número secreto
    if (chute == numeroSecreto) {
        false;
       break;
    } else {
        if (chute > numeroSecreto) {
            alert(`O número secreto é menor que ${chute}`)
        } else {
            alert(`O número secreto é maior que ${chute}`)
        }
        // tentativas = tentativas + 1
        tentativas++
    }
}

let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa' // Operador ternário
alert(`Isso ai! Você descobriu o número secreto ${numeroSecreto} com ${tentativas} ${palavraTentativa}`);