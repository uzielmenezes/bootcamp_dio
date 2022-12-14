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

  constructor() {}

  ngOnInit(): void {
    if (quiz_questions) {
      this.title = quiz_questions.title;

      this.questions = quiz_questions.questions;
      this.questionSelected = this.questions[this.questionIndex];

      this.questionMaxIndex = this.questions.length;
    }
  }

  playerChoice(value: string): void {
    this.answers.push(value);
    console.log(this.answers);
    this.nextStep();
  }

  nextStep(): void {
    this.questionIndex += 1;
    if (this.questionMaxIndex > this.questionIndex) {
      this.questionSelected = this.questions[this.questionIndex];
    } else {
      this.finished = true;
    }
    this.result();
  }

  result(): void {
    if (this.finished) {
      let villain = this.answers.filter((alias) => alias === 'A').length;
      let hero = this.answers.filter((alias) => alias === 'B').length;
      if (villain > hero) {
        this.answerSelected = quiz_questions.results['A'];
      } else {
        this.answerSelected = quiz_questions.results['B'];
      }
      console.log('O seu resultado é: ', this.answerSelected);
    }
  }

  returnQuiz() {
    this.finished = false;
    this.answers = [];
    this.questionIndex = 0;
    this.questionSelected = this.questions[this.questionIndex];
  }
}
