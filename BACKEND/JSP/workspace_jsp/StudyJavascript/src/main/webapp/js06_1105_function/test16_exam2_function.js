// 배열 출력 
function printArray (arr) {
	
	for (let i=0;i<arr.length;i++) {
		document.write(arr[i]+" ");	
	}
	
	document.write("<br>");
}
// 배열안에 데이터를 옮기는 작업 (한바퀴 돌리기)
function rotation (arr) {
	let tmp =arr[0];
	
	for (let j=0;j<arr.length;j++) {
	  // 1 2 3 4 5 
		arr[j]=arr[j+1];
	  
		if (j == arr.length-1) {
			arr[j]=tmp;
		}
	}
}