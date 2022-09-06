const fs=require('fs');
const path=require('path');
/*fs.writeFile(path.join(__dirname,'/training_detail','/student_name.txt')
,'deepak'
,(err)=>{
    if(err) throw err;
    console.log('file written to...');
})*/
fs.readFile(path.join(__dirname,'/training_detail','/student_name.txt'),'utf8'

,(err,data)=>{
    if(err) throw err;
    console.log(data);
})
