var algo = algo || {};
algo =(()=>{
	let init =x=>{
		algo.$.init(x);
	};
	let onCreate =()=>{
		setContentView();
	};
	let setContentView =()=>{
			$.when(
				$.getScript($.js()+'/component/compo.js'),
				$.getScript($.js()+'/algorithm/sequence.js')
			).done(()=>{
				sequence();
			}
		);
	};
	/*let nav =()=>{
		$('#nav').children().eq(0).html($$.a({id : 'seq', url:'#'}).text('수열'));
		$('#nav').children().eq(1).html($$.a({id : 'math', url:'#'}).text('수학'));
		$('#nav').children().eq(2).html($$.a({id : 'sort', url:'#'}).text('정렬'));
		$('#nav').children().eq(3).html($$.a({id : 'arr', url:'#'}).text('배열'));
		$('#nav').append($$.li({id:'app'}))
		$('#nav').children().eq(4).html($$.a({id : 'app', url:'#'}).text('응용'));
		
	}
	let question = (x)=>{
		$('#question').text(x); 
		form();
		$('#reset_btn').text('리셋').addClass('cursor').click(()=>{
			form();
		})
		
	}
	let rm =()=>{
		$('#rm').before('<div id="del_start_2"/>')
		$('#rm_end').after('<div id ="del_end_2">')
		$('#del_start_2').nextUntil('#del_end_2').wrap().remove();
		
	}
	
	let form =()=>{
		$('p#result').html($$.form({id:'form'}).append($$.label({name:'form-group'}).text('StartNum')).append('</br>')
						.append($$.input({type: 'text', id:'startNum'})).append('</br>')
						.append($$.label({name:'form-group'}).text('EndNum')).append('</br>')
						.append($$.input({type: 'text', id:'endNum'})).append('</br>')
						.append($$.label({name:'form-group'}).text('DiffNum')).append('</br>')
						.append($$.input({type: 'text', id:'diffNum'})));
	}*/
	return{init:init,
		onCreate : onCreate};
})();



algo.$ ={
		init : (x)=>{
			$.getScript(x+'/resources/js/router.js',()=>{
				$.extend(new Session(x));
				algo.onCreate();
			})
		}
};