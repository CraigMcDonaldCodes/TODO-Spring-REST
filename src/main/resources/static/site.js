// Handler for input submitted
$(document).on('click', '#submit', function(e) {

	var msg = $("#entry-input").val();
	console.log("Input value: " + msg);

	// Clear the input
	$("#entry-input").val("");
});
