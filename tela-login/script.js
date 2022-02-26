var user = {
    login: '',
    senha: '',
    logado: false
}

$(document).ready(() =>{
    console.log('JQuery is loaded...');
});

function realizarLogin(){
    console.log('Login realizado!')
    createDestroyLoading();
    var loginSubmit = $('#login').val();
    var senhaSubmit = $('#senha').val();

    if (login && senha) {
        user = {login: loginSubmit, senha: senhaSubmit, logado: true}
        console.log(user);
    }

    createDestroyLoading(true);
}

function createDestroyLoading(destroy = false) {
    if(!destroy) {
        var loadingDiv = document.createElement('div');
        var imgLoading = document.createElement('img');

        $(imgLoading).attr('src','_img/load.gif');
        $(loadingDiv).append(imgLoading);
        $(loadingDiv).attr('class', 'loading');

        $('body').append(loadingDiv);
        console.log(loadingDiv);
    } else {
        setTimeout(() => $('.loading').remove(), 2000);
    }
    
}

function verificaLogin() {
    if (get('user')) {
        $('#formLoginDiv').hide();
    }
}

// Storage Functions

function inserir(key, value) {
    if (localStorage.getItem(key)) {
        localStorage.removeItem(key);
        localStorage.setItem(key, value);
    } else {
        localStorage.setItem(key, value);
    }
}

function remover(key) {
    localStorage.removeItem(key);
}

function get(key) {
    localStorage.getItem(key);
}