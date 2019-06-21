import {HttpClient, HttpParams} from '@angular/common/http'
import {Injectable} from '@angular/core'
import { Task } from './task.model';

@Injectable()
export class TaskService{
	constructor(private http: HttpClient){

	}

	getsTasks(){
		return this.http.request("GET","/api/tasks",{responseType:"json"});
		//this.http.get('/api/tasks').map(reponse => response.json);
	}

	saveTask(task: Task,checked: boolean){
		task.completed = checked;
	
		
		//const params = new HttpParams({fromObject:});
		return this.http.request("POST","/api/tasks/save",{responseType:"json",body:JSON.parse(JSON.stringify(task))});
		//var response_ = this.http.post('/api/tasks/save',task);
		
		//return ;
	}
}