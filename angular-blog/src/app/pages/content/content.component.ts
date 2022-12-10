import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-content',
  templateUrl: './content.component.html',
  styleUrls: ['./content.component.css'],
})
export class ContentComponent implements OnInit {
  @Input()
  imageCover: string = ``;

  @Input()
  contentTitle: string = ``;

  @Input()
  contentDescription: string = ``;

  constructor() {}

  ngOnInit(): void {}
}
