(ns a3)

(defn -main [& args])

(defn prompt [prompt] (print (format "%s: " prompt)) (flush ) (read-line))

(defn pose_question [question answer_a answer_b answer_c answer_d correct_answer] 
	(println question "\n A:" answer_a "\n B:" answer_b "\n C:" answer_c "\n D:" answer_d)
	(def answer (prompt "Answer"))
	(def answered = false)
	(while (!= answered) (do))
	(if (= answer correct_answer) 1 0))
(defn play []
	(def questions (list 
		{:question "one" :a "me" :b "lol" :c "lol" :d "lol" :answer "a"}
		{:question "two" :a "me" :b "lol" :c "lol" :d "lol" :answer "a"}
		{:question "three" :a "me" :b "lol" :c "lol" :d "lol" :answer "a"}
		{:question "four" :a "me" :b "lol" :c "lol" :d "lol" :answer "a"}
		{:question "five" :a "me" :b "lol" :c "lol" :d "lol" :answer "a"}))
	(def score 0)
	;((nth questions 0) :question)
	(def q (nth questions 0))
	(doseq [q questions]
		(def score 
			(+ score 
				(pose_question 
					(q :question) (q :a) (q :b) (q :c) (q :d) (q :answer)))))
	(println "score: " score))

(play)