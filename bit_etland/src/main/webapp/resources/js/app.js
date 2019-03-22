var app = app || {};
app=(()=>{
	var init =x=>{
		app.session.init(x);
		onCreate();
	}
	var onCreate = ()=>{
		setContentView();
	}
	var setContentView =()=>{
/*		$('#mainNav').empty().text('네비');
		$('#header').empty().text('헤더');
		$('#main').empty().text('메인');
		$('#footer').empty().text('풋터');
		$('#mainNav').html('<h1>네비</h1>');
		$('#header').html('<h1>헤더 </h1>');
		$('#main').html('<h1>메인</h1>');
		$('#footer').html('<h1>풋터</h1>');*/
		
	}
	return{init : init}
})();

app.session = (()=>{
	var init =x=>{
		onCreate(x);
	}
	var onCreate =x=>{
		sessionStorage.setItem('ctx',x);
		sessionStorage.setItem('js',x+'/resources/js/');
		sessionStorage.setItem('css',x+'/resources/css/');
		sessionStorage.setItem('img',x+'/resources/img/');
	}
	var getPath =()=>{
		return session.Storage.getItem('ctx',x);
	}
	return {init : init}
})();


app.$ = {
		ctx : ()=>{return sessionStorage.getItem('ctx')},
		js : ()=>{return sessionStorage.getItem('js')},
		css : ()=>{return sessionStorage.getItem('css')},
		img : ()=>{return sessionStorage.getItem('img')}	
	};