;==================================================================
; File: SchemeFlipped.scm
; Written by: Sunhee Kim and Rishabh Tatia
; Date: 9/25/20
; TAMU email: sunheek@tamu.edu tatiaris@tamu.edu
; Class: CSCE 314 (section 502)
; Description: This is the first program for lab 5
;==================================================================

#lang racket

(define (make-node datum children)
  (cons datum children))

(define (datum node)
  (car node))

(define (children node)
  (cdr node))

(define world-tree1                           ; painful-to-type version
  (make-node
   'world
   (list (make-node
          'italy
          (list (make-node 'venezia '())
                (make-node 'riomaggiore '())
                (make-node 'firenze '())
                (make-node 'roma '()))
          )
         (make-node
          '(united_states)
          (list (make-node 'california
                           (list (make-node 'berkeley '())
                                 (make-node 'san_francisco '())
                                 (make-node 'gilroy '())))
                (make-node 'massachusetts
                           (list (make-node 'cambridge '())
                                 (make-node 'amherst '())
                                 (make-node 'sudbury '())))))))) 
(define (count-leaves tree)
  (cond ((null? tree) 0) ;if there is nothing in tree, return 0
        ((not (pair? tree)) 1) ; if there is something in tree but it is '() return 1
        (else (+ (count-leaves (datum tree)) 
                 (count-leaves (children tree)))))); else there is a pair and function is branched


; (datum world-tree)
;(display (datum (car (children world-tree1))))
(datum world-tree1)
(datum (children  world-tree1)) ; returns ITALY
(datum (children (cdr world-tree1))) ; returns US
(newline)

(display "(datum (car (children world-tree1)))");WORLD
(newline)


; (datum (car (children world-tree)))
(display (datum (car (children world-tree1))))
(newline)
;ITALY

; (datum (car (children (cadr (childrenworld-tree)))))
(display (datum (car (children (cadr (children world-tree1))))))
(newline)
;CALIFORNIA

(display
 (datum (car (children (car (children (cadr (children world-tree1))))))))
(newline)
(display "here")
(display (children world-tree1))
(newline)
(display (count-leaves world-tree1))
; (datum (car (children (car (children
;			            (cadr (children world-tree)))))))
; Berkeley
(define (leaf? node)
  (null? (children node)))

(define (far-left tree)
  (if (not ( leaf? tree))
      (far-left (datum (children tree)))
      tree
  )
)

(display  (far-left world-tree1))


(define (far-right tree)
  (if (not ( leaf? tree))
      (far-right (last_element (children tree)))
      tree
  )
)

(define (last_element l)
  (cond ((null? (cdr l)) (car l))
        (else (last_element (cdr l)))))



(define (count-nonleaves tree)
  (if (not (leaf? tree))
      1
      (count-nonleaves (children tree))
  )
)
(display  (far-right world-tree1))
(display  (count-nonleaves world-tree1))
