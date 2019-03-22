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
				$.getScript($.js()+'/component/navi.js'),
				$.getScript($.js()+'/algorithm/sequence.js'),
				$.getScript($.js()+'/algorithm/math.js')
			).done(()=>{
				nav();
				sequence();
				$('#seq').click(()=>{
					alert('수열 클릭!');
					$('#right_start').empty();
					$('#new_div').removeAttr('style');
					sequence();
				});
				$('#math').click(()=>{
					alert('수학 클릭!');
					math();
				});
				
			}
		);
	};
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