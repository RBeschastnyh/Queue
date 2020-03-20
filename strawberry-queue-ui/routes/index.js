var express = require('express');
var request = require('request');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Привет! Чо, в очередь записываешься?' });
});

router.get('/complete', function(req, res, next){
    res.render('book')
});

router.post('/book', function(req, res, next) {
      request.post({
        url: 'http://localhost:8081/book',
        form: {
          desiredDate: req.body.data_space,
          desiredTask: req.body.class_space,
          studentName: req.body.name_space,
          subject: "string"
        }
      }, (err, response, body) =>{
        if(err) {
          return res.status(500).send({message: err});
        }
        return res.send(body);
      });
    }
);

module.exports = router;
