/**
 * 
 */

function buttonDisabled(quantity) {
	var htmlBtn = document.getElementById("btn");
	
	if(quantity <= 0) {
		htmlBtn.disabled = true;
	} else {
		htmlBtn.disabled = false;
	}
}