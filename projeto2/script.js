console.log('Javascript iniciado!');

var qdVerm = document.getElementById('quadrado1');
var qdCinza = document.getElementsByClassName('quadrado')

posicionaQuadrados(qdCinza);


qdVerm.style.width = '100px';
qdVerm.style.height = '100px';


function posicionaQuadrados(collection) {
    console.log(collection);
    for (let i = 0; i < collection.length; i++) {
        const element = collection[i];
        console.log(element);
        element.style.top = retornaPosicao('Y');
        element.style.left = retornaPosicao('X');
        //element.style.display = 'block';
    }
}

function retornaPosicao(varXY) {
    var altura = 500, largura = 500;
    var medidaRetorno;

    if (varXY === 'X') { //left
        medidaRetorno = Math.random() * (largura - 0) + 0;
    } else { //top
        medidaRetorno = Math.random() * (largura - 0) + 0;
    }
    return `${medidaRetorno}px`;
}

// var texto = 'Texto JS';

// console.log(texto);

// texto = 200;

// console.log(texto);

// texto = {
//     id: 1,
//     textoHTML: 'Meu Texto Objeto'
// }

// console.log(texto);

// texto.atualizado = true;

// console.log(texto);

// texto.exibeTexto = function() {
//     console.log(this.id + ' - ' + this.textoHTML);
//     alert(this.id + ' - ' + this.textoHTML);
// };

// texto.exibeTexto();
// console.log(texto);
