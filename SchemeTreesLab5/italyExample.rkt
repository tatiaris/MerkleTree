#lang racket


(define (make-node datum children)
  (cons datum children))

(define (datum node)
  (car node))

(define (children node)
  (cdr node))
(define func
(make-node
    'italy
    (list 
         (make-node 'venezia '())
         (make-node 'riomaggiore '())
         (make-node 'firenze '())
         (make-node 'roma '())
    )
))


(define (leaf? node)
  (null? (children node)))

(datum func) ; returns italy
(datum  (cdr func)) ;returns venezia
(children func) ; returns "'((venezia) (riomaggiore) (firenze) (roma))"
(datum (children (cddr func))) ; returns firenzze