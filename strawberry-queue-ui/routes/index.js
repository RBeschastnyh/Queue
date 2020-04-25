var express = require('express');
var request = require('request');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Очередь СКБ' });
});

router.get('/complete', function(req, res, next){
    res.render('book')
});

router.post('/book', function(req, res, next) {
      request.post({
        url: 'http://localhost:8081/book',
        form: {
          desiredDate: req.body.data_space.toString(),
          desiredTask: req.body.task_space,
          studentName: req.body.name_space,
          subject: req.body.class_space
        }
      }, (err, response, body) =>{
        if(err) {
          return res.status(500).send({message: err});
        }
        result = res.send(body);
      });
    }
);

module.exports = router;
