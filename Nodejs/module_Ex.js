var M = {
    v:'v',
    f:function(){
      console.log(this.v);
    }
}
   
module.exports = M; // M이 가리키는 객체를 외부에서 사용할 수 있도록 함