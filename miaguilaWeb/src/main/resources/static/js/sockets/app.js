var stompClient = null;

connect();


function setConnected(connected) {
    if (connected) {
    	console.log("connected "+connected);
    }
    else {
    	console.log("connected "+connected);
    }
}

function connect() {
    var socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/ws/travels', function (answer) {
           
        	showanswer(answer.body);
        });
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}

function sendReq() {
    stompClient.send("/app/mensaje", {}, JSON.stringify({'name': $("#name").val()}));
}

function showanswer(message) {
	console.log(message);
	
	$("#respuesta").html(message);
    ///$("#answers").append("<tr><td>" + message + "</td></tr>");
}

$(function () {
    $( "#send" ).click(function() { sendReq(); });
});