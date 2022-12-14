import { Component, OnInit } from '@angular/core';

import quiz_questions from './../../../assets/data/quiz_questions.json';

@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css'],
})
export class QuizComponent implements OnInit {
  title: string = 'QUIZ';

  questions: any;
  questionSelected: any;

  answers: string[] = [];
  answerSelected: string = '';

  questionIndex: number = 0;
  questionMaxIndex: number = 0;

  finished: boolean = false;

  response: string = '';

  constructor() {}

  ngOnInit(): void {
    if (quiz_questions) {
      this.title = quiz_questions.title;

      this.questions = quiz_questions.questions;
      this.questionSelected = this.questions[this.questionIndex];

      this.questionMaxIndex = this.questions.length;
    }
  }

  playerChoice(value: string) {
    this.answers.push(value);
    console.log(this.answers);
    this.nextStep();
  }

  nextStep() {
    this.questionIndex += 1;
    if (this.questionMaxIndex > this.questionIndex) {
      this.questionSelected = this.questions[this.questionIndex];
    } else {
      this.finished = true;
    }
    this.result();
  }

  result() {
    if (this.finished) {
      let villain = this.answers.filter((x) => x === 'A').length;
      let hero = this.answers.filter((x) => x === 'B').length;
      if (villain > hero) {
        this.response = quiz_questions.results.A;
      } else {
        this.response = quiz_questions.results.B;
      }
    }
  }
}
