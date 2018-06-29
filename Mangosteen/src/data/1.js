  function onload(){
    var body = document.body,
    html = document.documentElement;

    var height = Math.max( 
      body.scrollHeight, body.offsetHeight, html.clientHeight, html.scrollHeight, html.offsetHeight );
	
	var menorah = document.getElementById('menorah');
	menorah.style.height= (height-150)+'px';
	alert(menorah.style.height)
  }
