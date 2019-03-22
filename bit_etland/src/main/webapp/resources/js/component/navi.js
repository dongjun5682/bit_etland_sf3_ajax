function nav(){
	_nav.navigation();
}

var _nav = {
		navigation : ()=>{
			$('#nav').children().eq(0).html($$.a({id : 'seq', url:'#'}).text('수열'));
			$('#nav').children().eq(1).html($$.a({id : 'math', url:'#'}).text('수학'));
			$('#nav').children().eq(2).html($$.a({id : 'sort', url:'#'}).text('정렬'));
			$('#nav').children().eq(3).html($$.a({id : 'arr', url:'#'}).text('배열'));
			$('#nav').append($$.li({id:'app'}))
			$('#nav').children().eq(4).html($$.a({id : 'app', url:'#'}).text('응용'));
		}
}