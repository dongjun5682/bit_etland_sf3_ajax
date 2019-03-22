function math(){
	_math.remove();
	$('#right_start').empty();
	$('#new_div').removeAttr('style');
	$('#right_content').prepend($$.div({id:'right_start'}));
	$('#leave_a_comment').before('<div id="right_end"/>')
	$('#right_start').nextUntil('#right_end').wrapAll('<div id="new_div_math"></div>');
	$('#nav').children().eq(0).removeClass('active');
	$('#nav').children().eq(1).attr('class','active');
	let str = $('#new_div_math').html();
	
	let arr = [
		{id:'count' ,val :'Count 알고리즘'},
		{id:'geo' ,val :'최댓값과 최솟값'},
		{id:'fac' ,val :'합계와 평균'},
		{id:'fibo' ,val :'소수 판별'},
		{id:'fibo' ,val :'소인수 분해'},
		{id:'fibo' ,val :'배수와 공배수'},
		{id:'fibo' ,val :'약수와 완전수'},
		{id:'fibo' ,val :'최대공약수와 최소공배수'},
		{id:'fibo' ,val :'근사값'},
		{id:'fibo' ,val :'10진수와 2진수의 변환'},
		{id:'fibo' ,val :'10진수와 16진수의 변환'},
		{id:'fibo' ,val :'BCD 코드와 3초과 코드의 변환'},
		{id:'fibo' ,val :'1의 보수와 2의 보수'},
		{id:'fibo' ,val :'패리티 비트 검증'}
		];
	$.each(arr,(i,j)=>{
			let GID = Math.floor(Math.random() * 10000) + 1;
			let _GID = '#'+GID;
			$('<div id="'+GID+'">'+str+'</div>')
				.appendTo('#right_start');
			
			let POST=GID+"_POST";
			let _POS='#'+POST;
			$(_GID+' h4').attr('id',POST);
			
			let TITLE = GID+"_TITLE";
			let _TITLE = '#'+TITLE;
			$(_GID+' h2').attr('id',TITLE);
			
			let DATE=GID+'_DATE';
			let _DATE='#'+DATE;
			$(_TITLE).siblings('h5').eq(0).attr('id',DATE);
			
			let BTN = GID+'_BTN';
			let _BTN = '#'+BTN;
			$(_TITLE).siblings('h5').eq(1).attr('id',BTN);
			
			let INPUT = GID+'_INPUT';
	        let _INPUT = '#'+INPUT;
	        $(_GID+' p').attr('id',INPUT);
	        
	        $('#'+TITLE).text(j.val);
	        $(_BTN).empty();
	        $('#'+INPUT).empty();
	        
	        let x=[{cls:'start',txt:'시작값'},
	        		{cls:'end',txt:'한계값'},
	        		{cls:'diff',txt:'공차'}];
	        $(_math.inputForm(x)).appendTo(_INPUT);
	        $('#del_start').remove();
	        $('#del_end').remove();
	        $('<span class="label label-danger"></span>')
	        .text('결과')
			.addClass('cursor')
			.attr('name',j.id)
			.appendTo(_BTN)
			.click(function(){
				let that = $(this).attr('name');
				let data = {start: $(_GID+' .start').val(),
						 	end: $(_GID+' .end').val(),
						 	diff: $(_GID+' .diff').val()};
				$.ajax({
					url : $.ctx()+'/algo/seq/'+that,
					type : 'post',
					data : JSON.stringify(data),
					dataType: 'json',
					contentType : "application/json",
					success : d=>{
						$(_INPUT).empty();
						$('<h2>결과값 : '+d.result+'</h2>')
						.appendTo(_INPUT);
					},
					error : e=>{
						alert('AJAX 실패');
					}
				});
			});
	        $('<span class="label label-warning" style="margin-left: 20px"></span>')
			.text('리셋')
			.addClass('cursor')
			.appendTo(_BTN)
			.click(()=>{
				$(_INPUT).empty();
				$(_math.inputForm(x))
					.appendTo(_INPUT);
			}); 
});
	$('#new_div_math').remove();
	
}

var _math = {
		inputForm : (x)=>{
			let html = '<form>';
			$.each(x, (i,j)=>{
				html += '<div class="form-group">';
				html += '<label for="">'+j.txt+' :</label>';
				html += '<input type="text" class="'+j.cls+'"></div>';
			});
			html +='</form>';
			return html;
		},
		remove : ()=>{
			$('#rm').before('<div id="del_start"/>')
			$('#rm_end').after('<div id ="del_end">')
			$('#del_start').nextUntil('#del_end').remove()
		}
}

