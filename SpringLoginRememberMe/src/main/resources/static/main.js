var classSize = 0;
function myFunction() {
	$(".plus-button").remove();
	$(".minus-button").remove();
	var a = "<div class='Models"
			+ ++classSize
			+ "'> <input type='text' name='name' class='name' id='name'/><select><option value='text'>Text Field</option><option value='drop'>Drop-Down</option><option value='radio'>Radio</option><option value='checkbox'>Checkbox</option></select><a onclick='myFunction()'   class='plus-button' style='z-index:1'>+</a>  <a onclick='minusFunction()'   class='minus-button' style='z-index:1'>-</a></div>";
	a
	$('.Model-design').append(a);
	/* document.getElementById("demo").innerHTML = a; */
}

function minusFunction() {
	$('.Model-design').children().last().remove();
	var a = "<a onclick='myFunction()'   class='plus-button' style='z-index:1'>+</a>  <a onclick='minusFunction()'   class='minus-button' style='z-index:1'>-</a>";
	var model = ".Models" + --classSize;
	$(model).append(a);
}
