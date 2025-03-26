
// 페이지 로딩 완료 시 채팅 시작 
$(function(){
	connect();
})

// 최초 1회 웹소켓 연결을 수행하는 connect() 함수 정의 
function connect() {
	// 요청 주소 생성(웹소켓 기본 프로토콜은 ws, 보안 프로토콜 wss)
	// let ws_base_url ="ws://localhost:8080/mvc_board";
	let ws_base_url ="ws://192.168.2.200:8080/mvc_board";
	ws = new WebSocket(ws_base_url +"/echo");

	ws.onopen = onOpen();
	ws.onclose = onClose();
	ws.onmessage = onMessage();
	ws.onerror = onError();
}


function onOpen() {
	console.log("onOpen()");
}
function onMessage() {
	console.log("onMessage()");
}

function onClose() {
	console.log("onClose()");
}
function onError() {
	console.log("onError()");
}