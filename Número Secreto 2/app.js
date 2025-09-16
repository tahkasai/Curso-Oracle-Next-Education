let numeroSecreto = gerarNumeroAleatorio();
let tentivas = 1;

// Automatizando a exibição do texto 
function exibirTextoNaTela(tag,texto){
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
}

// função pra mensagem inicial
function mensagemInicial(){
    exibirTextoNaTela('h1',"Jogo do número secreto");
    exibirTextoNaTela('p',"Escolha um número entre 1 a 10");
}

mensagemInicial();

function verificarChute(){ // criando uma função (trecho de código que realiza determinada ação)
    let chute = document.querySelector('input').value;
    
    // se a pessa acerta
    if (chute == numeroSecreto){
        exibirTextoNaTela('h1',"Você acertou!");
        let mensagem = `Você descobriu o número secreto com ${tentivas==1?"uma ":""}${tentivas} ${tentivas==1?"tentativa":"tentativas"}`;

        exibirTextoNaTela('p',mensagem);

        document.getElementById('reiniciar').removeAttribute('disabled');
    // se a pessoa erra
    } else {
        if(chute > numeroSecreto){
            exibirTextoNaTela('p','O número secreto é menor');
        } else {
            exibirTextoNaTela('p','O número secreto é maior');
        }
        limparCampo();
    }
    tentivas++;
}

// Função limpar campo
function limparCampo(){
    chute = document.querySelector('input');
    chute.value = '';
}

// Função pra criar um número aleatório
function gerarNumeroAleatorio(){
    return parseInt(Math.random()* 10 + 1);
}

// reiniciar o jogo
function reiniciarJogo(){
    mensagemInicial();

    numeroSecreto = gerarNumeroAleatorio;
    tentivas = 1;
    limparCampo();

    document.getElementById('reiniciar').setAttribute('disabled',true);
}

// Array para exivar que caia o mesmo número